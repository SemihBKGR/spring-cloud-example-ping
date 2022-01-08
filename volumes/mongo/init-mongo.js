db.createUser(
    {
        user: "user",
        pwd: "password",
        roles: [
            {
                role: "readWrite",
                db: "domains"
            },
            {
                role: "readWrite",
                db: "schedules"
            },
            {
                role: "readWrite",
                db: "communications"
            },
            {
                role: "readWrite",
                db: "tracks"
            }
        ]
    }
)