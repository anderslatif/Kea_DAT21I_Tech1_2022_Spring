SELECT name, title, year FROM directors
INNER JOIN movies on directors.movie_id = movies.id;

SELECT name, title, year FROM directors
LEFT JOIN movies on directors.movie_id = movies.id;

SELECT * FROM (directors, movies)
WHERE directors.movie_id = movies.id;


SELECT title, year, name FROM movies
INNER JOIN movies_actors ma on movies.id = ma.movie_id
INNER JOIN actors a on ma.actor_id = a.id;


# Inserting into many-to-many relations
INSERT INTO production_teams(team_name) VALUES ('A - Team');
INSERT INTO movies_production_teams(movie_id, production_team_id) VALUES (3, 1);

# DELETE the relationship of production team A
DELETE FROM production_teams WHERE id = 1;