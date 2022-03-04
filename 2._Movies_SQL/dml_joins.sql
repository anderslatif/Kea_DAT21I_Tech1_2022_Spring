SELECT name, title, year FROM directors
INNER JOIN movies on directors.movie_id = movies.id;

SELECT name, title, year FROM directors
LEFT JOIN movies on directors.movie_id = movies.id;

SELECT * FROM (directors, movies)
WHERE directors.movie_id = movies.id;



