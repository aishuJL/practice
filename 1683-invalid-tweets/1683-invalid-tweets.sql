# Write your MySQL query statement below
SELECT t.tweet_id
FROM Tweets t
WHERE CHAR_LENGTH(content)>15;
