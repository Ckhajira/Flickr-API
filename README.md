## Tech Market App

This is an Android app that provides a marketplace for paintings and hard-copy photos , 07/12/2021.

By Khajira Christopher

## Description
This is a marketplace app that allows the user to purchase paintings and hard-copy photos. The site allows the user
to login after which he gets a list of all available paintings. From the list of paintings, the user is able to select
a painting and view the details of the painting. From the details, the user is provided with the option to buy the product.
He is then presented with the form for delivery which requires the name, address and phone number.


## Behaviour Driven Development
1.  Displays Login Page
   - INPUT: "Fill the email and password form"
   - OUTPUT: "User is directed to the choices page"
   
2.  Displays two buttons: button for MarketPlace and Button for Flickr Inspiration
   - INPUT: "Market Place Button or Flickr Button"
   - OUTPUT: "If Market Place Button": 
   i) Displays a list view with the list of the paintings
   - INPUT: "Click on image to select a painting"
   - OUTPUT: "Redirected to the painting details"
   ii)  Displays painting details of the painting selected in the list view
   - INPUT: "Button to Buy the painting"
   - OUTPUT: "Redirected to the delivery form"
   iii)  Displays delivery form
   - INPUT: "Name, address and phone number of the user"
   - OUTPUT: "Redirected to the success page"
   iv) Displays success page
   - OUTPUT: "Thank you message to the user and a summary of the delivery information"
   v) Displays About Us and More Info
   - Input: "About Us Button"
   - Output: "About Us Details"
   vi) Displays MoreInfo
   - Input: "More Info button"
   - Output: "Website url that uses implicit intent to redirect user to an outside source"
   
3. Displays two buttons: button for MarketPlace and Button for Flickr Inspiration
   - INPUT: "Market Place Button or Flickr Button"
   - OUTPUT: "If Flickr Button"
   i) Displays title, name and photo fetched from FLickr throgh Flick API. Next button goes to next photo

## Setup/Installation Requirements

1. Clone the project using git clone https://github.com/Ckhajira/tech-market. If you are not able to clone it, you can download the files as a zip folder

2. Ensure that you have the complete file

3. Navigate to Android Studio and automatically install the required dependencies using Gradle

4. Build and run the project and view it on the Android Studio Emulator or connect your Android Phone to view the app

## Technologies Used
This project uses Java and Android

## Support and contact details

If you have any issues or questions, you can get intouch with me through email: christopher.khajira@student.moringaschool.com. Please feel free to make any contributions to the code.

## License

MIT License
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Copyright (c) 2021 Khajira Christopher
