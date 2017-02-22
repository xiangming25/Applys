require(['/Applys/js/main.js'],function(){
	require(['jquery','ueditor'],function(){
		init();
		
		function init(){
			var ue = UE.getEditor('raceDesc');
		}
		
	});
});