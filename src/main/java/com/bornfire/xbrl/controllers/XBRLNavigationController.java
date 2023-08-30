package com.bornfire.xbrl.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.xbrl.entities.AlertManagementEntity;
import com.bornfire.xbrl.entities.AlertManagementRepository;

import com.bornfire.xbrl.entities.BankMaster;
import com.bornfire.xbrl.entities.CustomRepDownloadRep;
import com.bornfire.xbrl.entities.CustomReportParms;
import com.bornfire.xbrl.entities.CustomReportsParmsRepo;
import com.bornfire.xbrl.entities.FinSolTb;
import com.bornfire.xbrl.entities.GenRefCodeMast;
import com.bornfire.xbrl.entities.UserProfile;
import com.bornfire.xbrl.entities.BRSS.AUDReconOs_Mirror;
import com.bornfire.xbrl.entities.BRSS.CountryRiskParameter;
import com.bornfire.xbrl.entities.BRSS.CountryRiskParameterRep;

import com.bornfire.xbrl.entities.BRSS.RBSReportRepo;
import com.bornfire.xbrl.entities.BRSS.RBSTransactionMasterEntity;
import com.bornfire.xbrl.entities.BRSS.RRReportRepo;
import com.bornfire.xbrl.entities.BRSS.ReportValidations;
import com.bornfire.xbrl.entities.BRSS.ReportValidationsRepo;
import com.bornfire.xbrl.entities.BRSS.T1CurProdServicesRepo;
import com.bornfire.xbrl.entities.BRSS.ValidationResponse;
import com.bornfire.xbrl.services.AlertManagementServices;



import com.bornfire.xbrl.services.BankServices;
import com.bornfire.xbrl.services.CountryRiskServices;
import com.bornfire.xbrl.services.CustomRepGeneratorServices;
import com.bornfire.xbrl.services.CustomRepParamServices;
import com.bornfire.xbrl.services.EtlServices;
import com.bornfire.xbrl.services.GlSubHeadConfigService;
import com.bornfire.xbrl.services.LoginServices;
import com.bornfire.xbrl.services.RBSValidationservices;

import com.bornfire.xbrl.services.ReferenceCodeConfigure;
import com.bornfire.xbrl.services.ReportCodeMappingService;
import com.bornfire.xbrl.services.ReportServices;
import com.bornfire.xbrl.services.ReportServices.ReportTitle;


import net.sf.jasperreports.engine.JRException;

@Controller
@ConfigurationProperties("default")
public class XBRLNavigationController {

	private static final Logger logger = LoggerFactory.getLogger(XBRLNavigationController.class);

	@Autowired
	LoginServices loginServices;

	@Autowired
	ReportServices reportServices;

	@Autowired
	CountryRiskParameterRep countryRiskParameterRep;

	@Autowired
	ReferenceCodeConfigure referenceCodeConfigure;

	@Autowired
	BankServices bankServices;

	@Autowired
	CountryRiskServices countryRiskServices;

	@Autowired
	ReportCodeMappingService reportCodeMappingService;

	@Autowired
	EtlServices etlServices;

	@Autowired
	GlSubHeadConfigService glSubHeadConfigService;

	@Autowired
	CustomRepGeneratorServices customerRepGenServices;

	@Autowired
	CustomReportsParmsRepo custReportsParmsRepo;

	@Autowired
	CustomReportsParmsRepo customReportsParmsRepo;

	@Autowired
	CustomRepDownloadRep customRepDownloadRep;

	@Autowired
	CustomRepParamServices customRepParamServices;

	@Autowired
	RBSReportRepo rbsReportlist;

	@Autowired
	RRReportRepo rrReportlist;

//	@Autowired
//	HostDataRepo hostDataRepo;

	

	@Autowired
	ReportValidationsRepo reportValidationsRepo;

	@Autowired
	RBSValidationservices rbsValidationservices;

	@Autowired
	T1CurProdServicesRepo t1CurProdServicesRepo;

	
	@Autowired
	private AlertManagementRepository alertmanagementrepository;

	@Autowired
	AlertManagementServices alertservices;

	
	

	
	private String pagesize;

	public String getPagesize() {
		return pagesize;
	}

	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}

	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String getdashboard(Model md, HttpServletRequest req) {

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		String userid = (String) req.getSession().getAttribute("USERID");
		md.addAttribute("menu", "Dashboard");
		md.addAttribute("checkpassExpiry", loginServices.checkpassexpirty(userid));
		md.addAttribute("checkAcctExpiry", loginServices.checkAcctexpirty(userid));
		md.addAttribute("changepassword", loginServices.checkPasswordChangeReq(userid));

		int completed = 0;
		int uncompleted = 0;

		List<ReportTitle> ls = reportServices.getDashBoardRepList(domainid);

		for (ReportTitle var : ls) {
			if (var.getCompletedFlg().equals('Y')) {
				completed++;
			} else {
				uncompleted++;
			}
		}

		md.addAttribute("reportList", ls);
		md.addAttribute("completed", completed);
		md.addAttribute("uncompleted", uncompleted);
		md.addAttribute("menu", "Dashboard");
		return "XBRLDashboard";
	}

	@RequestMapping(value = "Dashboard", method = { RequestMethod.GET, RequestMethod.POST })
	public String dashboard(Model md, HttpServletRequest req) {

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		String userid = (String) req.getSession().getAttribute("USERID");

		md.addAttribute("changepassword", loginServices.checkPasswordChangeReq(userid));
		md.addAttribute("checkpassExpiry", loginServices.checkpassexpirty(userid));
		md.addAttribute("checkAcctExpiry", loginServices.checkAcctexpirty(userid));
		int completed = 0;
		int uncompleted = 0;

		List<ReportTitle> ls = reportServices.getDashBoardRepList(domainid);

		for (ReportTitle var : ls) {
			if (var.getCompletedFlg().equals('Y')) {
				completed++;
			} else {
				uncompleted++;
			}
		}

		md.addAttribute("reportList", ls);
		md.addAttribute("completed", completed);
		md.addAttribute("uncompleted", uncompleted);
		md.addAttribute("menu", "Dashboard");
		return "XBRLDashboard";
	}

	@RequestMapping(value = "UserProfile", method = { RequestMethod.GET, RequestMethod.POST })
	public String userprofile(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String userid,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {
		System.out.println("abcd");
		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		String loginuserid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("USERPROFILE", "M2", req.getSession().getId(), loginuserid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "UserProfile"); // To highlight the menu

		if (formmode == null || formmode.equals("list")) {

			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("userProfiles", loginServices.getUsersList());

		} else if (formmode.equals("edit")) {

			md.addAttribute("formmode", formmode);
			md.addAttribute("domains", reportServices.getDomainList());
			md.addAttribute("userProfile", loginServices.getUser(userid));

		} else {

			md.addAttribute("formmode", formmode);
			md.addAttribute("domains", reportServices.getDomainList());
			//md.addAttribute("FinUserProfiles", loginServices.getFinUsersList());
			md.addAttribute("userProfile", loginServices.getUser(""));

		}

		return "XBRLUserprofile";
	}

	@RequestMapping(value = "CountryRisk", method = RequestMethod.GET)
	public String CountryRisk(Model md, HttpServletRequest req) {
		// Logging Navigation
		// System.out.print("fgdfh");
		String userid = (String) req.getSession().getAttribute("USERID");

		loginServices.SessionLogging("BANKMAST", "M3", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("bankdata", countryRiskParameterRep.getall());
		md.addAttribute("singledetail", new CountryRiskParameter());
		md.addAttribute("menu", "CountryRiskParameter");

		return "XBRLCountryRiskParameter";
	}

	@RequestMapping(value = "BankMaster", method = RequestMethod.GET)
	public String bankmaster(Model md, HttpServletRequest req) {
		// Logging Navigation
		// System.out.print("fgdfh");
		String userid = (String) req.getSession().getAttribute("USERID");
		loginServices.SessionLogging("BANKMAST", "M3", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");
		md.addAttribute("bankdata", bankServices.getBankData());
		md.addAttribute("singledetail", new BankMaster());
		md.addAttribute("menu", "BankMaster");

		return "XBRLBankMaster";
	}

	@RequestMapping(value = "EtlMonitor", method = RequestMethod.GET)
	public String etlMonitor(Model md, HttpServletRequest req) {
		// Logging Navigation

		String userid = (String) req.getSession().getAttribute("USERID");

		// loginServices.SessionLogging("", "M3", req.getSession().getId(), userid,
		// req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("EtlError", etlServices.getEtlError());
		md.addAttribute("EtlStatus", etlServices.getEtlStatus());
		md.addAttribute("menu", "EtlMonitor");

		return "XBRLEtlMonitor";
	}

	@RequestMapping(value = "GlSubHead", method = RequestMethod.GET)
	public ModelAndView glSubHead(Model md, HttpServletRequest req,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size) {
		String userid = (String) req.getSession().getAttribute("USERID");

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		logger.info("xbrlnavigationcontroller -> glSubHead()");

		md.addAttribute("menu", "GlSubHead");
		md.addAttribute("displaymode", "detail");
		ModelAndView mv = glSubHeadConfigService.getGlSubHeadMeta(PageRequest.of(currentPage, pageSize));
		// md.addAttribute("singledetail", new BankMaster());

		return mv;
	}

	@RequestMapping(value = "BranchMaster", method = RequestMethod.GET)
	public String branchMaster(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("BRANCHMAST", "M3", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("branchList", bankServices.getBranchList());

		md.addAttribute("menu", "BranchMaster");

		return "XBRLBranchMaster";
	}

	@RequestMapping(value = "ReferenceCode", method = RequestMethod.GET)
	public String refcode(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");

		// Logging Navigation
		loginServices.SessionLogging("REFCODE", "M6", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("menu", "ReferenceCode");
		md.addAttribute("refCodeTypeList", referenceCodeConfigure.genRefCodeDescList());
		md.addAttribute("referdetail", new GenRefCodeMast());
		return "XBRLRefCodeConfig";
	}

	@RequestMapping(value = "ReportCode", method = RequestMethod.GET)
	public String repcode(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("REPCODE", "M7", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("menu", "ReportCode");
		return "XBRLRepCodeConfig";
	}

	@RequestMapping(value = "ReportCodeMaintain", method = RequestMethod.GET)
	public String repmain(Model md, HttpServletRequest req, @RequestParam(required = false) String dtltype,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size,
			@RequestParam(required = false) String acctnum) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("REPCODE", "M7", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("menu", "ReportCodeMaintain");

		if (dtltype == null) {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getRepCodeMapLists(PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain";

		} else if (dtltype.equals("page")) {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getRepCodeMapLists(PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain :: repcodeconfig";

		} else {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getSearchResult(acctnum, PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain :: repcodeconfig";
		}

	}

	@RequestMapping(value = "ReportCodeMaintain2", method = RequestMethod.GET)
	public String repmain2(Model md, HttpServletRequest req, @RequestParam(required = false) String dtltype,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size,
			@RequestParam(required = false) String acctnum) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("REPCODE", "M7", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("menu", "ReportCodeMaintain2");

		if (dtltype == null) {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getRepCodeMapLists(PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain2";

		} else if (dtltype.equals("page")) {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getRepCodeMapLists(PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain2 :: repcodeconfig";

		} else {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getSearchResult(acctnum, PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain2 :: repcodeconfig";
		}

	}

	@RequestMapping(value = "ReportMaster", method = RequestMethod.GET)
	public String reportMaster(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("REPORTMAST", "M5", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "ReportMaster");
		md.addAttribute("reportList", reportServices.getReportsMaster());
		return "XBRLReportMaster";
	}

	@RequestMapping(value = "Audit", method = RequestMethod.GET)
	public String audit(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("AUDIT", "M11", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		LocalDateTime localDateTime = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		md.addAttribute("menu", "Audit");
		md.addAttribute("auditlogs", reportServices.getAuditLog(
				Date.from(localDateTime.plusDays(-5).atZone(ZoneId.systemDefault()).toInstant()), new Date()));
		return "XBRLAudit";
	}

	@RequestMapping(value = "Userlog", method = RequestMethod.GET)
	public String userlog(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("USERLOG", "M4", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		LocalDateTime localDateTime = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		md.addAttribute("menu", "Userlog");
		md.addAttribute("userlog", loginServices.getUserLog(
				Date.from(localDateTime.plusDays(-5).atZone(ZoneId.systemDefault()).toInstant()), new Date()));

		return "XBRLUserLogs";
	}

	@RequestMapping(value = "XBRLReports", method = RequestMethod.GET)
	public String xbrlrep(Model md, HttpServletRequest req) {

		md.addAttribute("menu", "XBRLReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getReportsList(domainid));
		return "XBRLReports";
	}

	@RequestMapping(value = "XBRLFileUpload", method = RequestMethod.GET)
	public String xbrlFileUpload(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("FILEUPLOAD", "M10", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "XBRLFileUpload");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getFileUploadList());
		return "XBRLFileUpload";
	}

	@RequestMapping(value = "FileUploadRL", method = RequestMethod.GET)
	public String FileUploadReturn(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("FILEUPLOAD", "M10", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "FileUpload");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getFileUploadList());
		return "FileUploadRL";
	}

	@RequestMapping(value = "XBRLArchives", method = RequestMethod.GET)
	public String xbrlarch(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");

		// Logging Navigation
		loginServices.SessionLogging("ARCHREPORTS", "M9", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "XBRLArchives");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getArchReportsList(domainid));

		return "XBRLArchive";
	}

	@RequestMapping(value = "MISReports", method = RequestMethod.GET)
	public String xbrlMISReports(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");

		// Logging Navigation
		loginServices.SessionLogging("MISREPORTS", "M12", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "MISReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getMISReportsList(domainid));

		return "XBRLMISReports";
	}

	@RequestMapping(value = "Finuserdata", method = RequestMethod.GET)
	public ModelAndView Finuserdata(@RequestParam String userid) {
		ModelAndView mv = new ModelAndView("XBRLUserprofile::finuserapply");
		mv.addObject("formmode", "add");
		mv.addObject("userProfile", loginServices.getFinUser(userid));
		return mv;

	}

	@RequestMapping(value = "createUser", method = RequestMethod.POST)
	@ResponseBody
	public String createUser(@RequestParam("formmode") String formmode, @ModelAttribute UserProfile userprofile,
			Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");
		String msg = loginServices.addUser(userprofile, formmode, userid);

		return msg;

	}

	@RequestMapping(value = "verifyUser", method = RequestMethod.POST)
	@ResponseBody
	public String verifyUser(@ModelAttribute UserProfile userprofile, Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");
		String msg = loginServices.verifyUser(userprofile, userid);

		return msg;

	}

	@RequestMapping(value = "passwordReset", method = RequestMethod.POST)
	@ResponseBody
	public String passwordReset(@ModelAttribute UserProfile userprofile, Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");
		String msg = loginServices.passwordReset(userprofile, userid);

		return msg;

	}

	@RequestMapping(value = "changePassword", method = RequestMethod.POST)
	@ResponseBody
	public String changePassword(@RequestParam("oldpass") String oldpass, @RequestParam("newpass") String newpass,
			Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");
		String msg = loginServices.changePassword(oldpass, newpass, userid);

		return msg;

	}

	@RequestMapping(value = "updateValidity", method = RequestMethod.POST)
	@ResponseBody
	public String updateValidity(@RequestParam("reportid") String reportid, String valid, HttpServletRequest rq) {

		String userid = (String) rq.getSession().getAttribute("USERID");

		return reportServices.updateValidity(reportid, valid, userid);

	}

	@RequestMapping(value = "userLogs/Download", method = RequestMethod.GET)
	@ResponseBody
	public InputStreamResource UserDownload(HttpServletResponse response, @RequestParam String fromdate,
			@RequestParam String todate) throws IOException, SQLException {
		response.setContentType("application/octet-stream");

		InputStreamResource resource = null;

		try {
			Date fromdate2 = new SimpleDateFormat("dd-MM-yyyy").parse(fromdate);
			Date todate2 = new SimpleDateFormat("dd-MM-yyyy").parse(todate);
			File repfile = loginServices.getUserLogFile(fromdate2, todate2);
			response.setHeader("Content-Disposition", "attachment; filename=" + repfile.getName());
			resource = new InputStreamResource(new FileInputStream(repfile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}

	@RequestMapping(value = "auditLogs/Download", method = RequestMethod.GET)
	@ResponseBody
	public InputStreamResource auditDownload(HttpServletResponse response, @RequestParam String fromdate,
			@RequestParam String todate) throws IOException, SQLException {
		response.setContentType("application/octet-stream");

		InputStreamResource resource = null;

		try {
			Date fromdate2 = new SimpleDateFormat("dd-MM-yyyy").parse(fromdate);
			Date todate2 = new SimpleDateFormat("dd-MM-yyyy").parse(todate);
			File repfile = reportServices.getAuditLogFile(fromdate2, todate2);
			response.setHeader("Content-Disposition", "attachment; filename=" + repfile.getName());
			resource = new InputStreamResource(new FileInputStream(repfile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}

	@RequestMapping(value = "repCodeMain/Download", method = RequestMethod.GET)
	@ResponseBody
	public InputStreamResource repCodeMainDownload(HttpServletResponse response, @RequestParam String function)
			throws IOException, SQLException {

		response.setContentType("application/octet-stream");

		logger.info("Function Selected--->>>" + function);

		InputStreamResource resource = null;

		try {

			File repfile = reportCodeMappingService.getDownloadFile(function);
			response.setHeader("Content-Disposition", "attachment; filename=" + repfile.getName());
			resource = new InputStreamResource(new FileInputStream(repfile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}

	@RequestMapping(value = "logoutUpdate", method = RequestMethod.POST)
	@ResponseBody
	public String logoutUpdate(HttpServletRequest req) {

		String msg;

		String userid = (String) req.getSession().getAttribute("USERID");

		try {
			logger.info("Updating Logout");
			loginServices.SessionLogging("LOGOUT", "M0", req.getSession().getId(), userid, req.getRemoteAddr(),
					"IN-ACTIVE");
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failed";
		}
		return msg;
	}

	@PostMapping("repCodeMain/Upload")
	@ResponseBody
	public String FileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest rq)
			throws IOException, SQLException {

		String msg = "";

		String userid = (String) rq.getSession().getAttribute("USERID");
		msg = reportCodeMappingService.processUploadFiles(file, userid);

		return msg;
	}

	@RequestMapping(value = "CustomReports", method = { RequestMethod.GET, RequestMethod.POST })
	public String CustomReports(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String rpt_ref_no, @RequestParam(required = false) String userid,
			@RequestParam(required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		System.out.println("page" + currentPage);
		System.out.println("page" + pageSize);
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		// md.addAttribute("AMLRoleMenu", AccessRoleService.getRoleMenu(roleId));
		if (formmode == null || formmode.equals("list")) {
			md.addAttribute("menuname", "Reports Parameter");
			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("repParameter", custReportsParmsRepo.findAllCustom(PageRequest.of(currentPage, pageSize)));

		} else if (formmode.equals("add")) {

			md.addAttribute("menuname", "Reports Parameter - Add");
			md.addAttribute("formmode", "add");

		} else if (formmode.equals("edit")) {

			md.addAttribute("menuname", "Reports Parameter - Edit");
			md.addAttribute("formmode", "edit");
			md.addAttribute("Parameter", customRepParamServices.getParam(rpt_ref_no));

		} else if (formmode.equals("verify")) {

			md.addAttribute("menuname", "Reports Parameter - Verify");
			md.addAttribute("formmode", "verify");
			md.addAttribute("Parameter", customRepParamServices.getParam(rpt_ref_no));

		} else if (formmode.equals("view")) {

			md.addAttribute("menuname", "Reports Parameter - Inquiry");
			md.addAttribute("formmode", "view");
			md.addAttribute("Parameter", customRepParamServices.getParam(rpt_ref_no));

		}

		return "CustomRepParameter";
	}

	@RequestMapping(value = "createRepParam", method = RequestMethod.POST)
	@ResponseBody
	public String createRepParam(@RequestParam("formmode") String formmode,
			@ModelAttribute CustomReportParms customReportParms, Model md, HttpServletRequest rq)
			throws IOException, SQLException {

		String msg = customRepParamServices.customParam(customReportParms, formmode);
		md.addAttribute("adminflag", "adminflag");

		return msg;

	}

	@RequestMapping(value = "CustomRepGen", method = { RequestMethod.GET, RequestMethod.POST })
	public String CustomRepGen(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String userid, @RequestParam(required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));
		String userid1 = (String) req.getSession().getAttribute("USERID");

		System.out.println("page" + currentPage);
		System.out.println("page" + pageSize);
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		// md.addAttribute("AMLRoleMenu", AccessRoleService.getRoleMenu(roleId));
		if (formmode == null || formmode.equals("list")) {
			md.addAttribute("menu", "Report Generator");
			md.addAttribute("userProfile", loginServices.getUser(userid1));
			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("repParameter", custReportsParmsRepo.findAllCustom(PageRequest.of(currentPage, pageSize)));
		}

		return "CustomRepGeneration";
	}

	@RequestMapping(value = "CustomRepDown", method = { RequestMethod.GET, RequestMethod.POST })
	public String CustomRepDown(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String userid, @RequestParam(required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));
		String userid1 = (String) req.getSession().getAttribute("USERID");

		System.out.println("page" + currentPage);
		System.out.println("page" + pageSize);
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		// md.addAttribute("AMLRoleMenu", AccessRoleService.getRoleMenu(roleId));
		if (formmode == null || formmode.equals("list")) {
			md.addAttribute("menu", "Report Generator");
			md.addAttribute("userProfile", loginServices.getUser(userid1));
			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("repParameter", customRepDownloadRep.findAllCustom(PageRequest.of(currentPage, pageSize)));
		}

		return "CustomRepDownload";
	}

	@RequestMapping(value = "ExecuteRep", method = { RequestMethod.GET, RequestMethod.POST })
	public String ExecuteRep(@RequestParam(value = "ref_id", required = false) String ref_id,
			@RequestParam(value = "Param1", required = false) String input1,
			@RequestParam(value = "Param1", required = false) String input2,
			@RequestParam(value = "Param1", required = false) String input3,
			@RequestParam(value = "Param1", required = false) String input4,
			@RequestParam(value = "Param1", required = false) String input5,
			@RequestParam(required = false) String userid, @RequestParam(required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req)
			throws SQLException {
		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		String roleId = (String) req.getSession().getAttribute("ROLEID");
		// md.addAttribute("AMLRoleMenu", AccessRoleService.getRoleMenu(roleId));
		md.addAttribute("adminflag", "adminflag");

		try {
			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("headers", customerRepGenServices.getHeaders(ref_id));
			md.addAttribute("repList",
					customerRepGenServices.parameterlistwithdecode(ref_id, PageRequest.of(currentPage, pageSize)));

			CustomReportParms up = customReportsParmsRepo.findByIdcustom(ref_id);
			md.addAttribute("CustomReportParam", up);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "ReportExecutePage";

	}

	/**************************************************************************
	 * RBS REPORTS
	 **************************************************************************/

	@RequestMapping(value = "rbsreports", method = { RequestMethod.GET, RequestMethod.POST })
	public String RbsReports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "RBS Report");

		md.addAttribute("reportlist", rbsReportlist.getReportList());

		return "RBS_AML/RBSReports";
	}

	@RequestMapping(value = "rrreports", method = { RequestMethod.GET, RequestMethod.POST })
	public String RRReports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "RR Report");

		md.addAttribute("reportlist", rrReportlist.getReportList());
		// md.addAttribute("reportlist", rrReportlist.getReportListBASEL());

		return "RR/RRReports";
	}


	@RequestMapping(value = "rlreports", method = { RequestMethod.GET, RequestMethod.POST })
	public String RLReports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "Restructured Loan Report");

		md.addAttribute("reportlist", rbsReportlist.getReportListRL());

		return "RBS_AML/RBSReports";
	}

	@RequestMapping(value = "RBSDataMaintenance", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBSDataMaintenance(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "RBS Data Maintenance");

		md.addAttribute("RepMaster", rbsReportlist.getReportList());

		return "RBS_AML/RBSDataMaintenance";
	}

	@RequestMapping(value = "RBSArchival", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBSArchival(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "RBS Archival");

		md.addAttribute("reportlist", rbsReportlist.getReportList());

		return "RBS_AML/RBSArchival";
	}

	@RequestMapping(value = "CRRBSarchival", method = { RequestMethod.GET, RequestMethod.POST })
	public String CRRBSarchival(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "CR RBS Archival");

		md.addAttribute("reportlist", rbsReportlist.getReportListCR());

		return "CR_RBS/CRRBSArchival";
	}

	@RequestMapping(value = "LRArchival", method = { RequestMethod.GET, RequestMethod.POST })
	public String LRArchival(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "LR RBS Archival");

		md.addAttribute("reportlist", rbsReportlist.getReportListLR());

		return "LR_RBS/LRRBSArchival";
	}

	@RequestMapping(value = "MRArchival", method = { RequestMethod.GET, RequestMethod.POST })
	public String MRArchival(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "MR RBS Archival");

		md.addAttribute("reportlist", rbsReportlist.getReportListMR());

		return "MR_RBS/MRRBSArchival";
	}

	@RequestMapping(value = "rbsarchivalform", method = { RequestMethod.GET, RequestMethod.POST })
	public String Rbsarchivalfrom(Model md, @RequestParam(value = "reportid", required = false) String reportid,
			@RequestParam(value = "repdesc", required = false) String repdesc, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "RBS Report");
		md.addAttribute("datemodal", "datefilter");
		md.addAttribute("reportid", reportid);
		md.addAttribute("repdesc", repdesc);
		md.addAttribute("reportmodal", "Y");
		md.addAttribute("reportDATE", t1CurProdServicesRepo.getReportList());
		md.addAttribute("reportlist", rbsReportlist.getReportList());

		return "RBS_AML/RBSArchival";
	}

	@RequestMapping(value = "ORRBSarchival", method = { RequestMethod.GET, RequestMethod.POST })
	public String ORRBSarchival(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "Operating Risk Archival");

		md.addAttribute("reportlist", rbsReportlist.getReportListOR());

		return "OR_RBS/ORRBSArchival";
	}

	
	@RequestMapping(value = "crrbsreports", method = { RequestMethod.GET, RequestMethod.POST })
	public String CRRbsReports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "CR RBS Report");

		md.addAttribute("reportlist", rbsReportlist.getReportListCR());

		return "RBS_AML/RBSReports";
	}

	@RequestMapping(value = "ifrs9quan", method = { RequestMethod.GET, RequestMethod.POST })
	public String IFRSReports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "IFRS Quantitative Report");

		md.addAttribute("reportlist", rbsReportlist.getReportListIFRSQUAN());

		return "RBS_AML/RBSReports";
	}

	@RequestMapping(value = "ifrs9quli", method = { RequestMethod.GET, RequestMethod.POST })
	public String IFRSqualReports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "IFRS Qualitative Report");

		md.addAttribute("reportlist", rbsReportlist.getReportListIFRSQUALI());

		return "RBS_AML/RBSReports";
	}

	@RequestMapping(value = "ReconFileUpload", method = { RequestMethod.GET, RequestMethod.POST })
	public String Debit_Card_Fileupload(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");
		md.addAttribute("menu", "ReconFileUpload");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		return "BRECON/ReconFileupload";
	}

	@RequestMapping(value = "RBSReportGeneration", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBSReportGeneration(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("reportvalue", "RBS Report Generation");
		md.addAttribute("reportid", "RBSReportGeneration");
		md.addAttribute("menu", "RBS Report Generation");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");

		return "RBS_AML/RBSReportGeneration";
	}

	@RequestMapping(value = "RBSORReportGeneration", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBSORReportGeneration(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("reportvalue", "Operating Risk Generation");
		md.addAttribute("reportid", "ORReportGeneration");
		md.addAttribute("menu", "Operating Risk Generation");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");

		return "RBS_AML/RBSReportGeneration";

	}

	@RequestMapping(value = "RBSLRReportGeneration", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBSLRReportGeneration(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("reportvalue", "Operating Risk Generation");
		md.addAttribute("reportid", "LRReportGeneration");
		md.addAttribute("menu", "Liquidity Risk Generation");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");

		return "RBS_AML/RBSReportGeneration";

	}

	@RequestMapping(value = "RBSMRReportGeneration", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBSMRReportGeneration(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("reportvalue", "Market Risk Generation");
		md.addAttribute("reportid", "MRReportGeneration");
		md.addAttribute("menu", "Market Risk Generation");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");

		return "RBS_AML/RBSReportGeneration";

	}

	@RequestMapping(value = "RBSCRReportGeneration", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBSCRReportGeneration(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("reportvalue", "Operating Risk Generation");
		md.addAttribute("reportid", "CRReportGeneration");
		md.addAttribute("menu", "Credit Risk Generation");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");

		return "RBS_AML/RBSReportGeneration";

	}

	@RequestMapping(value = "CREDITGENERATION", method = { RequestMethod.GET, RequestMethod.POST })
	public String CREDITReportGeneration(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("reportvalue", "Report Generation");
		md.addAttribute("reportid", "ReportGeneration");
		md.addAttribute("menu", "Report Generation");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");

		return "RL_RBS/ReportGeneration";

	}

	@RequestMapping(value = "RBSCONTACT", method = RequestMethod.GET)
	public ModelAndView RBSCONTACTDETAIL(Model md, HttpServletRequest req,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size) {
		String userid = (String) req.getSession().getAttribute("USERID");

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		logger.info("xbrlnavigationcontroller -> glSubHead()");

		md.addAttribute("menu", "GlSubHead");
		md.addAttribute("displaymode", "detail");
		ModelAndView mv = glSubHeadConfigService.RBSCONTACTLIST(PageRequest.of(currentPage, pageSize));
		// md.addAttribute("singledetail", new BankMaster());

		return mv;
	}

	@RequestMapping(value = "rbsValidations", method = { RequestMethod.GET, RequestMethod.POST })
	public String rbsValidations(@RequestParam(value = "reportDate", required = false) String reportDate, Model md,
			HttpServletRequest req) {

		String roleId = (String) req.getSession().getAttribute("ROLEID");

		if (reportDate == null) {
			md.addAttribute("reportvalue", "RBS Report Generation");
			md.addAttribute("reportid", "rbsReportGeneration");
			reportDate = reportDate;
			md.addAttribute("reportDate1", reportDate);
			// md.addAttribute("reportDate1", reportValidationsRepo.getCurrentQtr(new
			// SimpleDateFormat("dd/MM/yyyy")));
			// reportDate = dateFormat.format(new Date());
		} else {
			reportDate = reportDate;
			md.addAttribute("reportDate1", reportDate);
			md.addAttribute("reportvalue", "RBS Report Generation");
			md.addAttribute("reportid", "rbsReportGeneration");
		}
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "RBS Validation Report");
		md.addAttribute("testDate", reportValidationsRepo.getCurrentQtr(new SimpleDateFormat("dd/MM/yyyy")));
		md.addAttribute("reportvalue", "RBS Report Generation");
		md.addAttribute("reportid", "rbsReportGeneration");

		md.addAttribute("RepValid", reportValidationsRepo.getValidationList());

		// md.addAttribute("reportvalue", "File Upload");

		return "RBS_AML/RBSValidations";
	}

	@RequestMapping(value = "rbsValidationsChk", method = RequestMethod.POST)
	@ResponseBody
	public ValidationResponse rbsValidationsChk(@RequestParam("srl_no") String srl_no,
			@RequestParam("report_date") String report_date, @ModelAttribute ReportValidations reportValidations,
			Model md, HttpServletRequest rq) throws ParseException {
		logger.info("rbsValidationsChk:  Controller");
		ValidationResponse msg = rbsValidationservices.chkRBSValidations(reportValidations, srl_no, report_date);
		md.addAttribute("reportsflag", "reportsflag");

		return msg;

	}

	@RequestMapping(value = "rrrbsreports", method = { RequestMethod.GET, RequestMethod.POST })
	public String rrrbsreports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		// md.addAttribute("menu", "RBS Report");

		md.addAttribute("reportlist", rbsReportlist.getReportListRR());

		return "RR_RBS/RR_RBSReports";
	}

	@RequestMapping(value = "LRrbsreports", method = { RequestMethod.GET, RequestMethod.POST })
	public String LRrbsreports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "LR RBS Report");

		md.addAttribute("reportlist", rbsReportlist.getReportListLR());

		return "RBS_AML/RBSReports";
	}

	@RequestMapping(value = "MRrbsreports", method = { RequestMethod.GET, RequestMethod.POST })
	public String MRrbsreports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "MR RBS Report");

		md.addAttribute("reportlist", rbsReportlist.getReportListMR());

		return "MR_RBS/MR_RBSReport";
	}

	@RequestMapping(value = "EPINOutstanding", method = { RequestMethod.GET, RequestMethod.POST })
	public String EPINOutstanding(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "LR RBS Report");

		md.addAttribute("reportlist", rbsReportlist.getReportListLR());

		return "RBS_AML/RBSReports";
	}

	@RequestMapping(value = "RBS_RR_ReportGeneration", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBS_RR_ReportGeneration(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("reportvalue", "Operating Risk Generation");
		md.addAttribute("reportid", "RRReportGeneration");
		md.addAttribute("menu", "Residual Risks Generation");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");

		return "RBS_AML/RBSReportGeneration";

	}

	@RequestMapping(value = "RBSAlertParameters", method = { RequestMethod.GET, RequestMethod.POST })
	public String AMLAlertManagement(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String srlno, @RequestParam(required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		if (formmode == null || formmode.equals("list")) {

			md.addAttribute("menu", "BRBSAlertParameters");
			md.addAttribute("menuname", "Alert Parameters");
			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			/*
			 * md.addAttribute("RuleLists",
			 * ruleenginerepository.findAll(PageRequest.of(currentPage, pageSize)));
			 */
			md.addAttribute("AlertParameterList",
					alertmanagementrepository.alertlist(PageRequest.of(currentPage, pageSize)));
		} else if (formmode.equals("add")) {
			md.addAttribute("formmode", formmode);
			md.addAttribute("AlertSrlNo", alertservices.getSrlNoValue());
		} else if (formmode.equals("edit")) {
			md.addAttribute("formmode", formmode);
			// md.addAttribute("domains", userProfileDao.getDomainList());
			md.addAttribute("AlertParameter", alertservices.getSrlNo(srlno));

		} else if (formmode.equals("view")) {
			md.addAttribute("formmode", formmode);
			md.addAttribute("AlertParameter", alertservices.getSrlNo(srlno));

		} else if (formmode.equals("delete")) {
			md.addAttribute("AlertParameter", alertservices.getSrlNo(srlno));
			md.addAttribute("formmode", "delete"); // to set which form - valid values are "edit" , "add" & "list"

		}
		md.addAttribute("adminflag", "adminflag");
		md.addAttribute("parameterflag", "parameterflag");

		return "AMLAlertParameters";
	}

	@RequestMapping(value = "createAlert", method = RequestMethod.POST)
	@ResponseBody
	public String createRule(@RequestParam("formmode") String formmode,
			@ModelAttribute AlertManagementEntity alertparam, Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");

		String msg = alertservices.addAlert(alertparam, formmode, userid);

		return msg;

	}

	@RequestMapping(value = "FileUploadCR_RBS", method = RequestMethod.GET)
	public String FileUploadReturnCR_RBS(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("FILEUPLOAD", "M10", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "FileUpload");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getFileUploadListCR_RBS());
		return "FileUploadRL";
	}
	@RequestMapping(value = "Monthly", method = { RequestMethod.GET, RequestMethod.POST })
	public String monthly(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", " Monthly  -RR Report");
 
		// md.addAttribute("reportlist", rrReportlist.getReportList());
		md.addAttribute("reportlist", rrReportlist.getReportListmonthly());

		return "RR/RRReports";
	}
	@RequestMapping(value = "Quarterly", method = { RequestMethod.GET, RequestMethod.POST })
	public String Quarterly(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", " Quarterly -RR Report");
 
		// md.addAttribute("reportlist", rrReportlist.getReportList());
		md.addAttribute("reportlist", rrReportlist.getReportListquarterly());

		return "RR/RRReports";
	}


}
