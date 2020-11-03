$(document).ready(function(){
    $(window).scroll(function(event){
        var position_body = $('html,body').scrollTop();
        // console.log('pos_body');
        if(position_body>300){
            $('.header-2').addClass('menu-hien-ra');
        }else{
            $('.header-2').removeClass('menu-hien-ra');
        }
    });
});