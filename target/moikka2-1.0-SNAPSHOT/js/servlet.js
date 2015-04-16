/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
 * Simone Salvo
 * www.simonesalvo.it
 * simone.salvo@ymail.com
 * 3935482782
 * 
 */


var sendPost = function()
{
    $.ajax({
        type: 'POST',
        crossDomain: true,
        async: true,
        url: '/post',
        data: {  },
        success: function() {
            //$("#load-div").hide();
           console.log("perfetto");
        }
    });
}

