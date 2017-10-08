package cn.apply.action;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.apply.base.BaseAction;
import cn.apply.domain.RaceBaseInfo;
import cn.apply.domain.RaceList;
import cn.apply.util.PrintJSON;


@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class RaceAction extends BaseAction<RaceBaseInfo> {
	
	public void find() throws Exception {
		JSONObject jsonObject = new JSONObject();
		Long id = Long.parseLong("1");
		RaceList raceList = raceService.getById(id);
		jsonObject.put("id", raceList.getId());
		jsonObject.put("academy", raceList.getAcademy());
		jsonObject.put("raceGrade", raceList.getRaceGrade());
		PrintJSON.print(request, response, jsonObject.toString());
	}
	
	/**
	 * 竞赛基本信息列表
	 * @return
	 * @throws Exception
	 */
	public String baseInfoList() throws Exception {
		return "baseInfoList";
	}
	
	/**
	 * 竞赛基本信息保存
	 * @return
	 * @throws Exception
	 */
	public String baseInfoSave() throws Exception {
		return "baseInfoSave";
	}
	
	/**
	 * 竞赛基本信息保存
	 * @return
	 * @throws Exception
	 */
	public String baseInfoDetail() throws Exception {
		return "baseInfoDetail";
	}
}
