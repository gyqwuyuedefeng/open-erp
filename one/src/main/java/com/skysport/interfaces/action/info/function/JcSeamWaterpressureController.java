package com.skysport.interfaces.action.info.function;

import com.skysport.core.action.BaseAction;
import com.skysport.core.annotation.SystemControllerLog;
import com.skysport.core.bean.page.DataTablesInfo;
import com.skysport.core.bean.system.SelectItem2;
import com.skysport.interfaces.bean.jc.JcSeamWaterpressure;
import com.skysport.interfaces.constant.WebConstants;
import com.skysport.interfaces.model.jc.IJcSeamWaterpressureService;
import com.skysport.interfaces.model.jc.helper.JcSeamWaterpressureHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 接缝水压接口层
 * Created by zhangjh on 2016-7-11 11:54:27
 */
@RestController
@RequestMapping("/system/function/seam_waterpressure")
public class JcSeamWaterpressureController extends BaseAction<JcSeamWaterpressure> {

    @Resource(name = "jcSeamWaterpressureServiceImpl")
    private IJcSeamWaterpressureService jcSeamWaterpressureServiceImpl;


    /**
     * 此方法描述的是：展示list页面
     *
     * @author: zhangjh
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    @SystemControllerLog(description = "点击菜单")
    public ModelAndView search() {
        ModelAndView mav = new ModelAndView("/system/function/seam_waterpressure/list");
        return mav;
    }

    /**
     * 查询详细信息
     *
     * @param businessKey
     * @return
     */
    @SystemControllerLog(description = "查询详细信息")
    @RequestMapping(value = "/info/{businessKey}", method = RequestMethod.GET)
    public JcSeamWaterpressure queryByBusinessKey(@PathVariable("businessKey") String businessKey) {
        JcSeamWaterpressure jcSeamWaterpressure = (JcSeamWaterpressure) jcSeamWaterpressureServiceImpl.queryInfoByNatrualKey(businessKey);
        return jcSeamWaterpressure;
    }


    /**
     * 删除
     *
     * @param businessKey
     * @return
     */
    @SystemControllerLog(description = "删除")
    @RequestMapping(value = "/del/{businessKey}", method = RequestMethod.DELETE)
    public Map<String, Object> deleteByBusinessKey(@PathVariable("businessKey") String businessKey) {
        JcSeamWaterpressure jcSeamWaterpressure = null;
        jcSeamWaterpressureServiceImpl.del(businessKey);
        JcSeamWaterpressureHelper.SINGLETONE.refreshSelect();
        return rtnSuccessResultMap("删除成功");
    }


    /**
     * 更新
     *
     * @param jcSeamWaterpressure
     * @return
     */
    @SystemControllerLog(description = "更新")
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public Map<String, Object> update(JcSeamWaterpressure jcSeamWaterpressure, HttpServletRequest request, HttpServletResponse respones) {
        jcSeamWaterpressureServiceImpl.edit(jcSeamWaterpressure);
        JcSeamWaterpressureHelper.SINGLETONE.refreshSelect();
        return rtnSuccessResultMap("更新成功");
    }


    /**
     * 此方法描述的是：
     *
     * @author: zhangjh
     * @version: 2015年4月29日 下午5:35:09
     */
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    @SystemControllerLog(description = "新增水压方式")
    public Map<String, Object> add(JcSeamWaterpressure jcSeamWaterpressure, HttpServletRequest request,
                                   HttpServletResponse reareaonse) {

        jcSeamWaterpressureServiceImpl.add(jcSeamWaterpressure);

        JcSeamWaterpressureHelper.SINGLETONE.refreshSelect();
        return rtnSuccessResultMap("新增成功");
    }

    /**
     * 此方法描述的是：
     *
     * @author: zhangjh
     * @version: 2015年4月29日 下午5:34:53
     */
    @RequestMapping(value = "/search")
    @ResponseBody
    @SystemControllerLog(description = "查询信息列表")
    public Map<String, Object> search(HttpServletRequest request) {
        DataTablesInfo dataTablesInfo = convertToDataTableQrInfo(WebConstants.SEAM_WATERPRESSURE_TABLE_COLUMN_NAME, request);
        // 总记录数
        int recordsTotal = jcSeamWaterpressureServiceImpl.listInfosCounts();
        int recordsFiltered = recordsTotal;
        if (!StringUtils.isBlank(dataTablesInfo.getSearchValue())) {
            recordsFiltered = jcSeamWaterpressureServiceImpl.listFilteredInfosCounts(dataTablesInfo);
        }
        int draw = Integer.parseInt(request.getParameter("draw"));
        List<JcSeamWaterpressure> infos = jcSeamWaterpressureServiceImpl.searchInfos(dataTablesInfo);
        Map<String, Object> resultMap = buildSearchJsonMap(infos, recordsTotal, recordsFiltered, draw);
        return resultMap;
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> querySelectList(HttpServletRequest request) {
        String name = request.getParameter("name");
        List<SelectItem2> commonBeans = jcSeamWaterpressureServiceImpl.querySelectList(name);
        return rtSelectResultMap(commonBeans);
    }
}
