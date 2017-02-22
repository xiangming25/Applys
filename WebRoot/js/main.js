/**
 * Created by xiangming on 2015/9/28.
 */

(function(w){
    /*-------------------对requirejs的配置-------------------*/
    require.config({
        baseUrl:"/Applys/js",
        waitSecond:30,
        urlArgs : "bust="+new Date().getTime(),
        paths:{
            "jquery":"jquery",
            "ueditor":"plugins/ueditor/ueditor.all",
            "ueditorConfig":"plugins/ueditor/ueditor.config",
            
            /*by myself*/
            // 添加竞赛基本信息
            "raceBaseInfoAdd":"race/raceBaseInfoAdd",

        },
        shim:{
        	"ueditor":['ueditorConfig']
        }
        
    });


})(window);


