//ajax find all
findAll()
function findAll() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/cities",
        success: function (data) {
            console.log(data)

            display(data);
        }
        ,
        error: function (error) {
            console.log(error);
        }

    });
}


function display(data) {
    let str = "";
    for (let i = 0; i < data.length; i++) {
        str += `<tr>
                    <td>${data[i].id}</td>
                    <td><a onclick="detail_city(${data[i].id})">${data[i].name}</a></td>
                    <td><a href="">Sửa</a></td>
                    <td><a href="">Xóa</a></td>
                </tr>`
    }
    document.getElementById("main").innerHTML = str;

}

function detail_city(id) {
    document.getElementById("modal-detail")
    //ajax find by id
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/cities/" + id,
            success: function (data) {
                console.log(data)

            }
            ,
            error: function (error) {
                console.log(error);
            }

        });

}