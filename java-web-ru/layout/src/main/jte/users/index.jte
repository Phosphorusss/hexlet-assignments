@import exercise.dto.users.UsersPage
@param UsersPage page

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Hexlet Javalin Example</title>
</head>
<body>
@template.layout.page(
content = @`
    @for(var user : page.getUsers())
        <p><a href="users/${user.getId()}">${user.getId()}</a></p>
        <p>${user.getFirstName()}</p>
        <p>${user.getLastName()}</p>
    @endfor
`
)
</body>
</html>