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
        <div>
            <!-- Example single danger button -->
            <div class="btn-group">
                <button type="button" class="btn btn-primary" data-toggle="dropdown" aria-haspopup="true"
                        aria-expanded="false">
                    Добавить сотрудника
                </button>
                <div class="dropdown-menu">
                <#---->
                    <form class="px-4 py-3">
                        <form method="post">
                            <div class="form-group">
                                <label for="DropdownFormUsername">Имя Фамилия</label>
                                <input type="text" name="journalistName" class="form-control" id="DropdownFormUsername"
                                       placeholder="Имя Фамилия">
                            </div>
                            <div class="form-group">
                                <label for="DropdownFormEmail">Email</label>
                                <input type="text" name="email" class="form-control" id="DropdownFormEmail"
                                       placeholder="email@example.com">
                            </div>
                            <div class="form-group">
                                <label for="DropdownFormPhoneNumber">Телефон</label>
                                <input type="text" name="phone" class="form-control" id="DropdownFormPhoneNumber"
                                       placeholder="+38(0**)**-**-***">
                            </div>
                            <div class="form-group">
                                <label for="DropdownFormHomeAddress">Адрес</label>
                                <input type="text" class="form-control" name="homeAddress" id="DropdownFormHomeAddress"
                                       placeholder="Киев, ул.Смирнова, 3">
                            </div>
                            <br>
                            <button class="container-fluid btn btn-primary" type="submit">Добавить</button>
                        </form>
                    </form>
                </div>
            <#---->
            </div>
        </div>
    </div>
    </div>
</nav>