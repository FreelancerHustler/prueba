Shared Dependencies:

1. Exported Variables:
   - `currentUserId`: The ID of the currently logged-in user.
   - `currentOrder`: The current order being created by the user.
   - `currentBooking`: The current booking being made by the user.

2. Data Schemas:
   - `User`: Contains user information such as ID, name, email, and saved payment information.
   - `Menu`: Contains information about the dishes available, including name, description, price, and image.
   - `Order`: Contains information about an order, including the user ID, dish IDs, special requests, and estimated delivery time.
   - `Booking`: Contains information about a booking, including user ID, date, time, number of guests, and confirmation status.
   - `Review`: Contains information about a review, including user ID, dish ID, rating, and comment.
   - `Notification`: Contains information about a notification, including user ID, message, and opt-out status.

3. ID Names of DOM Elements:
   - `menuList`: The list of dishes in the menu.
   - `orderForm`: The form for creating an order.
   - `bookingForm`: The form for making a booking.
   - `reviewForm`: The form for leaving a review.
   - `notificationList`: The list of notifications for the user.
   - `socialMediaLinks`: The links to the restaurant's social media profiles.
   - `locationMap`: The map showing the restaurant's location.

4. Message Names:
   - `orderConfirmation`: The message confirming an order.
   - `bookingConfirmation`: The message confirming a booking.
   - `paymentConfirmation`: The message confirming a payment.
   - `reviewSubmission`: The message confirming the submission of a review.
   - `notificationMessage`: The message for a notification.

5. Function Names:
   - `displayMenu()`: Displays the menu.
   - `createOrder()`: Creates an order.
   - `makeBooking()`: Makes a booking.
   - `submitReview()`: Submits a review.
   - `sendNotification()`: Sends a notification.
   - `shareOnSocialMedia()`: Shares an order or dining experience on social media.
   - `showLocation()`: Shows the restaurant's location on a map.