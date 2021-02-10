# Application Flow


### User Sign up

1. User chooses sign up on the home page(Only available on the homescreen all other pages require you to be logged in)
1. User fills out the sign up form and submits.
1. Request goes to sign up servlet.
1. Servlet creates a user object and then creates user in the database.
1. Response to user confirming addition (show a message on the jsp)

### User Sign In

1. User chooses sign in on the home page(All other pages require you to be logged in already)
1. User enters username and password on form and submits.
1. If user is authenticated, the server will handle allowing access to edit
   pages.  JDBCRealm used for authentication (users, users_roles, and roles table).
1. If authentication fails, show error message/page.

### View My Games

1. Option only available to logged in users with proper role
1. Page sends a request to view my games list servlet along with criteria (all, search, platform).
1. Servlet uses the mygameslist dao to display all games in users game list according to criteria
1. Dao performs select and creates game list objects from results.
1. Dao returns list of games matching criteria to servlet
1. Servlet sends list back to My Games jsp.
1. My Games jsp displays the game list.
1. Consider paging results so page does not get super long and too much data
   is sent.
   
### Add Game
1. Option only available to logged in users with proper role
1. User selects game from searched list which auto fills in game info
1. Game Info is sent to Add Game servlet
1. Servlet creates mygamelist object
1. Servlet sends object to dao
1. Dao adds game to the database
1. Servlet sends confirmation that the game has been added to your collection

### Add Game Manually
1. Option only available to logged in users with proper role
1. User enters game info
1. Game Info is sent to Add Game servlet
1. Servlet creates mygamelist object
1. Servlet sends object to dao
1. Dao adds game to the database
1. Servlet sends confirmation that the game has been added to your collection

### View Profile
1. Option only available to logged in users with proper role
1. Page sends a request to view my profile servlet along with criteria (username).
1. Servlet uses the user dao to display username and profile picture
1. Dao performs select on user database
1. Dao returns user matching criteria to servlet
1. Servlet sends user back to My Profile jsp.
1. My Profile jsp displays the username and profile picture.

### Edit Profile
1. Option only available to logged in users with proper role
1. User enters their info plus uploads profile picture
1. Profile info is sent to edit profile servlet
1. Servlet creates profile object
1. Servlet sends object to user dao
1. Dao edits user in the database to include new info
1. Servlet sends confirmation that their profile has been updated

   






 