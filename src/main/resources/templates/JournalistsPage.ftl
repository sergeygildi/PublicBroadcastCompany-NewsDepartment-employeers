<#import "parts/common.ftl" as c>

<@c.page>
<div class="row justify-content-md-center">
<#--тень на слое-->
    <div class="shadow-sm p-3 mb-5 bg-white rounded"><h3>Список журналистов</h3></div>
</div>

<br><br>
<#--Блок 3 формы разъездные + таблицы-->

        <div class="accordion" id="accordionExample">
        <#--Первая вкладка-->
            <div class="card">
                <div class="card-header" id="headingOne">

                <#--TODO Разобраться с розмешением ссылки и поиска внутри блока: ссылка слева, поиск справа.

                <#--Название таблицы-->
                    <h5>
                        <button class="btn btn-light" type="button" data-toggle="collapse" data-target="#collapseOne"
                                aria-expanded="true" aria-controls="collapseOne">
                            Журналисты
                        </button>
                    </h5>

                    <div>
                    <#--Поиск-->
                        <form method="get" action="/list_of_journalists">
                            <input type="text" name="filter" value="${filter?ifExists}">
                            <button type="submit">Найти</button>
                        </form>
                    </div>
                </div>
            <#--Внутренности-->
                <div id="collapseOne" class="collapse show" aria-labelledby="headingOne"
                     data-parent="#accordionExample">
                    <div class="card-body">

                    <#--таблица с данными-->
                        <table class="table table-hover table-bordered" style="width: 1070px;">
                            <thead>
                            <tr class="container">
                                <th scope="col">#</th>
                                <th scope="col">Имя</th>
                                <th scope="col">Фамилия</th>
                                <th scope="col">Email</th>
                                <th scope="col">Телефона</th>
                                <th scope="col">Адрес</th>
                                <th scope="col">Примечания</th>
                            </tr>
                            </thead>
                            <#list journalists as journalist>
                            <tbody>
                            <tr>

                                <th scope="row">${journalist.id}</th>
                                <td>${journalist.journalistName}</td>
                                <td>${journalist.journalistSurname}</td>
                                <td>${journalist.email}</td>
                                <td>${journalist.phone}</td>
                                <td>${journalist.homeAddress}</td>
                                <td class="table-warning">${journalist.designation}</td>
                                <td>
                                    <form action="delete" method="post">
                                        <input type="hidden" name="idJournalist" value="${journalist.id}">
                                        <button type="button" class="close" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </form>

                                </td>

                            </tr>
                            </tbody>
                            </#list>
                        </table>
                    </div>
                </div>
            </div>
        <#--Третья вкладка-->
            <div class="card">
                <div class="card-header" id="headingThree">
                    <h5 class="mb-0">
                        <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                                data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                            Добавить сотрудника
                        </button>
                    </h5>
                </div>
            <#--Внутренности-->
                <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
                    <div class="card-body">
                    <#--таблица с данными-->
                    <#---->
                        <div align="center">
                            <form method="post">
                                <input type="text" class="form-control" name="journalistName"
                                       placeholder="Имя"/><br>
                                <input type="text" class="form-control" name="journalistSurname"
                                       placeholder="Фамилия"/><br>
                                <input type="text" class="form-control" name="email" placeholder="Введите email"/><br>
                                <input type="text" class="form-control" name="phone"
                                       placeholder="+38(0**) ***-**-**"/><br>
                                <input type="text" class="form-control" name="homeAddress"
                                       placeholder="ул.Светлицкого, 23"/><br>
                                <input type="text" class="form-control" name="designation"
                                       placeholder="Опытный, бывалый, стажер"/><br>
                                <button class="container-fluid btn btn-primary" type="submit">Добавить</button>
                            </form>
                        </div>
                    <#---->
                    </div>
                </div>
            </div>
        </div>

</@c.page>
