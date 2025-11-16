CREATE TABLE IF NOT EXISTS blogging_app.entry (
    id SERIAL PRIMARY KEY,
    title VARCHAR(25) NOT NULL,
    content VARCHAR(100) NOT NULL,
    nsfw BOOLEAN 
);