$(document).ready(function(){
    $("button#getcontacts").click(function(){
        $.ajax({
            type: 'GET',
            url: 'http://localhost:9876/students',
            success: function(contactArray) {
                var contactsDiv = $('div#allContacts');
                //$("div#allContacts").html(result);
                //alert("result:" + contactArray);

                contactsDiv.remove(".StudentElement")

                $.each(contactArray, function(index, contact) {
                    var contactInfo = '<p class="StudentElement">';
                    contactInfo += '<div class="card">';
                    contactInfo += '<div class="card-body">';
                    
                    contactInfo += '<h5 class="card-title">'  + contact.name + '</h5>';
                    contactInfo += '<h6 class="card-subtitle mb-2 text-muted">Student Details</h6>';
                    contactInfo += '<hr>';
                    contactInfo += '<b>Name:</b> ' + contact.name + '<br>';
                    contactInfo += '<b>Age:</b> ' + contact.age + '<br>';
                    contactInfo += '<b>Address:</b> ' + contact.address + '<br>';
                    contactInfo += '<b>Phone</b>: ' + contact.mobile + '<br>';

                    contactInfo += '</div>';
                    contactInfo += '</div>';
                    contactInfo += '</p>';
                
                    contactsDiv.append(contactInfo);
                })
            },
            error: function() {
                alert('FAILURE!');
            }
        })
    });

})

$(document).ready(function () {
    $("#addStudent").click(function (event) {
      var formData = {
        'name' : $("#name").val(),
        'age' : parseInt($("#age").val()),
        'address' : $("#addr").val(),
        'mobile' : parseInt($("#phone").val())
      };

      // console.log(JSON.stringify(formData));

      $.ajax({
        type: "POST",
        url: "http://localhost:9876/students",
        data: JSON.stringify(formData),
        dataType: "application/json",
        contentType:'application/json;charset=UTF-8',
        encode: true,
      }).done(function (data) {
        console.log(data);
      });
  
      event.preventDefault();
    });
  });