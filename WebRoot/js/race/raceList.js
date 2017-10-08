require(['/Applys/js/main.js'],function(){
	require(['jquery'],function(){
		getInfo();
		
		/**
		 * 获取数据
		 */
		function getInfo() {
			$.get('race_find', function(data) {
				console.log('data:-----------------',data);
			});
		}
		
	});
});