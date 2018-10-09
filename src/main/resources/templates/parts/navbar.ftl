<#import "login.ftl" as l>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/main">UA:НОВИНИ</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
            aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav mr-auto">
            <a class="nav-item nav-link active" href="/main">Главная<span class="sr-only">(current)</span></a>
            <a class="nav-item nav-link" href="/list_of_journalists">Журналисты</a>
        </div>
        <@l.logout/>
        <div>

        <#--TODO Create authorization
            1. Make login button;
            2. Create checkout. If user do authorization or registration - hide button and show text "Hello, username";
            3. All of this at navigation bar;-->
        <#--TODO Implement as JS code;
            1. Rewrite "addEmplyer" code to JavaScript -->

            <div>
            <#--Кнопка "Добавить сотрудника"-->
                <button type="button" class="btn btn-outline-primary" data-toggle="modal" data-target="#addEmployee">
                    Добавить сотрудника
                </button>
            <#--Конец кнопки-->

            <#--Код всплывающего окна с полями для ввода-->
                <div id="addEmployee" class="modal fade" tabindex="-1">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title">Добавить сотрудника</h4>
                                <button class="close" data-dismiss="modal">x</button>
                                <br>
                            <#--<p>Заполните обязательные поля ниже и нажмите на кнопку "Добавить"</p>-->
                            </div>

                        <#--Начало тела всплывающего окна-->
                            <form method="post">
                                <div class="modal-body">

                                    <input type="text" class="form-control" name="journalistName"
                                           placeholder="Введите имя"/><br>
                                    <input type="text" class="form-control" name="journalistSurname"
                                           placeholder="Введите фамилию"/><br>
                                    <input type="email" class="form-control" name="email"
                                           placeholder="Введите email"/><br>
                                    <input type="text" class="form-control" name="phone"
                                           placeholder="Введите номер телефона в формате: +38(0**) ***-**-**"/><br>

                                    <textarea type="text" class="form-control" name="homeAddress" rows="2"
                                              placeholder="Киев, ул.Светлицкого, 23"></textarea><br>

                                    <select class="form-control" name="designation" id="selectSkillsLevel">
                                        <option selected>Уровень подготовки ...</option>
                                        <option>Начальный</option>
                                        <option>Средний</option>
                                        <option>Продвинутый</option>
                                    </select>
                                </div>
                            <#--Конец тела всплывающего окна-->

                                <div class="modal-footer">
                                    <input type="hidden" name="_csrf" value="{{_csrf.token}}" />
                                    <button class="container-fluid btn btn-primary" type="submit">Добавить</button>
                                    <button class="btn btn-danger" data-dismiss="modal">Закрыть</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            <#--Конец кода всплывающего окна с полями для ввода-->

            </div>
        </div>

    </div>
    </div>
</nav>