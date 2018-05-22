var Money = 10;

$(document).ready(function () {

    pickShell1();
    pickShell2();
    pickShell3();



});
function pickShell1() {
  $('#shell1').click(function(event){
      $("#shell1").empty();
  $.ajax({
    type: 'GET',
    url: 'http://localhost:8080/api/shells',
    success: function(data, status) {
      $.each(data, function(index, shell){
          var id = shell.shellNumber;
          var pebble = shell.hasPebble;

          var winner = "Congrats you won!";
          var loser = "You lost!"


          if(id === 1 && pebble === true){
            $("#shell1").append(winner);
            Money =+ money + 10;
            console.log("Winner");
          }
          if(id === 1 && pebble === false){
              $("#shell1").append(loser);
          }

        });
      }
    });
  });
}
function pickShell2() {
  $('#shell2').click(function(event){
      $("#shell2").empty();
  $.ajax({
    type: 'GET',
    url: 'http://localhost:8080/api/shells',
    success: function(data, status) {
      $.each(data, function(index, shell){
          var id = shell.shellNumber;
          var pebble = shell.hasPebble;

          var winner = "Congrats you won!";
          var loser = "You lost!"


          if(id === 2 && pebble === true){

            $("#shell2").append(winner);

          }
          if(id === 2 && pebble === false){

              $("#shell2").append(loser);

          }
        });
      }
    });
  });
}
function pickShell3() {
  $('#shell3').click(function(event){
      $("#shell3").empty();
  $.ajax({
    type: 'GET',
    url: 'http://localhost:8080/api/shells',
    success: function(data, status) {
      $.each(data, function(index, shell){
          var id = shell.shellNumber;
          var pebble = shell.hasPebble;

          var winner = "Congrats you won!";
          var loser = "You lost!"


          if(id === 3 && pebble === true){
            $("#shell3").append(winner);

          }
          if(id === 3 && pebble === false){

              $("#shell3").append(loser);
            }
          });
        }
      });
    });
  }
