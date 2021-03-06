SELECT EMPLOYEE_SEQ.NEXTVAL FROM DUAL;

SELECT EMPLOYEE_SEQ.CURRVAL FROM DUAL;

SELECT 5*5 FROM DUAL;

CREATE OR REPLACE TRIGGER NEW_EMPLOYEE_TRIG
  BEFORE INSERT ON EMPLOYEE
  FOR EACH ROW
  BEGIN
    SELECT EMPLOYEE_SEQ.NEXTVAL INTO :new.E_ID FROM DUAL;
  END;
  /
  
INSERT INTO EMPLOYEE (E_EMAIL, E_FIRSTNAME, E_LASTNAME) VALUES('myawesomeemail@gmail.com', 'My', 'Awesome');

INSERT INTO EMPLOYEE (E_ID, E_EMAIL, E_FIRSTNAME, E_LASTNAME) VALUES(1, 'newawesomeemail@gmail.com', 'New', 'Awesome');

UPDATE EMPLOYEE SET E_ID=1, E_FIRSTNAME='NEW FIRSTNAME' WHERE E_ID = 3;

CREATE OR REPLACE TRIGGER UPDATE_EMPLOYEEE_TRIG
  BEFORE UPDATE ON EMPLOYEE
  FOR EACH ROW
  BEGIN
    SELECT:old.E_ID INTO :new.E_ID FROM DUAL;
    
    END;
/

SELECT * FROM TRACK;

CREATE or REPLACE VIEW FULL_TRACK_DETAILS
AS
SELECT TRACK.NAME AS TITLE, 
  ALBUM.TITLE AS ALBUM,
  ARTIST.NAME AS ARTIST,
  GENRE.NAME AS GENRE,
  PLAYLIST.NAME AS PLAYLIST
  FROM TRACK 
    LEFT OUTER JOIN GENRE 
    ON TRACK.GENREID = GENRE.GENREID
    LEFT OUTER JOIN ALBUM 
    ON TRACK.ALBUMID = ALBUM.ALBUMID
    LEFT OUTER JOIN ARTIST 
    ON ALBUM.ARTISTID = ARTIST.ARTISTID
    LEFT OUTER JOIN PLAYLISTTRACK
    ON TRACK.TRACKID = PLAYLISTTRACK.TRACKID
    LEFT OUTER JOIN PLAYLIST
    ON PLAYLISTTRACK.PLAYLISTID = PLAYLIST.PLAYLISTID;
    
    SELECT * FROM TRACK WHERE TRACKID = 50000;
    
    INSERT INTO TRACK (TRACKID, NAME, ALBUMID, UNITPRICE, MEDIATYPEID, MILLISECONDS) VALUES(50000, 'MY NEW TRACK', 3 , 1.22, 1, 1);
    
 COMMIT;   
  
  SELECT * FROM FULL_TRACK_DETAILS WHERE ARTIST <> 'AC/DC' 
  AND PLAYLIST IN (SELECT PLAYLIST FROM FULL_TRACK_DETAILS WHERE ARTIST = 'AC/DC');
  
  SELECT PLAYLIST FROM FULL_TRACK_DETAILS WHERE ARTIST = 'Aerosmith';