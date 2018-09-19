<#import "parts/common.ftl" as c>

<@c.page>
<div class="row justify-content-md-center">
<#--тень на слое-->
    <div class="shadow-sm p-3 mb-5 bg-white rounded"><h1>Список сотрудников</h1></div>
</div>

<div>
    <form method="post">
        <input type="text" name="employerName" placeholder="Введите ФИО"/>
        <input type="text" name="phone" placeholder="Введите номер телефона"/>
        <input type="text" name="email" placeholder="Введите email"/>
        <input type="text" name="homeAddress" placeholder="Введите домашний адрес для развозки"/>
        <button type="submit">Добавить</button>
    </form>
</div>

<br><br>
<#--Блок 3 формы разъездные + таблицы-->

        <div class="accordion" id="accordionExample">
            <div class="card">
                <div class="card-header" id="headingOne">
                    <h4 class="col-md-6">
                        <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne">
                            Журналисты
                        </button>
                    </h4>
                </div>

                <div id="collapseOne" class="collapse show" aria-labelledby="headingOne"
                     data-parent="#accordionExample">
                    <div class="card-body">

                    <#--таблица с данными-->
                        <table class="table table-hover table-bordered" style="width: 1070px;">
                            <thead>
                            <tr class="container">
                                <th scope="col">#</th>
                                <th scope="col">Ф.И.О.</th>
                                <th scope="col">Номер телефона</th>
                                <th scope="col">Email</th>
                                <th scope="col">Адрес для развозки</th>
                            </tr>
                            </thead>
                            <#list employers as employeer>
                            <tbody>
                            <tr>

                                <th scope="row">${employeer.id}</th>
                                <td>${employeer.employerName}</td>
                                <td>${employeer.phone}</td>
                                <td>${employeer.email}</td>
                                <td>${employeer.homeAddress}</td>
                                <td>
                                    <button type="button" class="close" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </td>

                            </tr>
                            </tbody>
                            </#list>
                        </table>

                    </div>
                </div>
            </div>
        </div>
</@c.page>
