@import exercise.dto.users.UsersPage
@param UsersPage page

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Home page</title>
</head>
<body>

@template.layout.page(content = @`
    <h2>Hello!</h2>
    <a href="/users">Users</a>
`
)
</body>
</html>