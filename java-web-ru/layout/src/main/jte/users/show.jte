@import exercise.dto.users.UserPage
@param UserPage page

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
        <p>${page.getUser().getFirstName()}</p>
        <p>${page.getUser().getLastName()}</p>
    `
    )
</body>
</html>