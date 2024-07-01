@import gg.jte.Content
@param Content content

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Hexlet Javalin Example</title>
</head>
<body>
<header>
    <nav>
        <ul>
            <li><a href="/">home page</a></li>
            <li><a href="/users">All users</a></li>
        </ul>
    </nav>
</header>
${content}
<footer>
    <p>footer</p>
</footer>
</body>
</html>