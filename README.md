# 🧁 **Cupcake**
**Cupcake** is a modern, interactive Android app that allows users to customize and order cupcakes. This app highlights Android development best practices, such as Jetpack Compose, ViewModel, and reactive state management using StateFlow.

## 🚀 **Features**
   -🛒 **Customizing Orders**
      - Quantity: Select from quantity options (1, 6 or 12 cupcakes).
      - Flavors: Choose from several flavors like vanilla, chocolate, or salted caramel.
      - Pickup Date: Schedule a pickup date (with surcharge for same-day pickup).
   - 💲 **Dynamic Price Calculation**
      - The total price is automatically calculated based on the quantity selected and the pickup date.
      - Prices are formatted to fit the local currency.
   - 📝 **Order Summary**
      - View a complete summary of your order, including quantity, flavor, pickup date, and total price.
      - Options to confirm or cancel the order.
   - 🎨 **Modern Interface**
      - Built with Jetpack Compose for a smooth, declarative user experience.
      - Integration of Material 3 for an aesthetic and coherent design.

## 🛠️ Tech Stack
   - **Kotlin**: Modern and concise language.
   - **Jetpack Compose**: Declarative UI Toolkit for Android.
   - **Material 3**: Modern and accessible user interface.
   - **StateFlow**: Reactive state management for real-time updates.
   - **ViewModel**: MVVM architecture to separate business logic from user interface.

## 📦 Project Structure
**Packages**:
1. **Data**:
   - Defines data needed for orders, such as available flavors and quantity options.
   - Contains the OrderUiState template to manage order status.
2. **Ui/**:
      - Implements the user interface with Jetpack Compose components.
      - Contains screens like StartOrderScreen, SelectOptionScreen, and OrderSummaryScreen.
      - Manages navigation and user interactions.
3. **Viewmodel/**:
      - Contains OrderViewModel, which handles business logic and calculates the total price based on selections.


## 🚀 How to Play
1. **Launch the App**: Open Cupcake App on a device or emulator.
2. **Personalize your Order**:
      - Select the quantity of cupcakes you want
      - Choose a flavor and pickup date.
3. **Confirm or Cancel**: View your order summary, then confirm or cancel as needed.
4. **Enjoy**: Keep playing with the app to test different control configurations!