# 🧁 **Cupcake**
**Cupcake** is a modern, interactive Android app that allows users to customize and order cupcakes. This app highlights Android development best practices, such as Jetpack Compose, ViewModel, and reactive state management using StateFlow.

## 🚀 **Features**
   - 🛒 **Customizing Orders**
      - **Quantity**: Select from quantity options (1, 6 or 12 cupcakes).
      - **Flavors**: Choose from several flavors like vanilla, chocolate, or salted caramel.
      - **Pickup Date**: Schedule a pickup date (with surcharge for same-day pickup).
   - 💲 **Dynamic Price Calculation**
      - The total price is automatically calculated based on the quantity selected and the pickup date.
      - Prices are formatted to fit the local currency.
   - 📝 **Order Summary**
      - View a complete summary of your order, including quantity, flavor, pickup date, and total price.
      - Options to confirm or cancel the order.
   - 🗺️ **Screen Navigation**
      - **Start Screen**: Select the quantity of cupcakes.
      - **Flavor Screen**: Choose your desired flavor.
      - **Pickup Screen**: Select a pickup date from the available options.
      - **Summary Screen**: Review the full order details before confirmation.
   - 🗂️ **Enhanced Navigation**
      - Each screen includes a top AppBar with a back button, providing seamless navigation to the previous screen. This mirrors the functionality of the device's back button for a consistent user experience.
   - 🎨 **Modern Interface**
      - Built with Jetpack Compose for a smooth, declarative user experience.
      - Integration of Material 3 for an aesthetic and coherent design.

## 🛠️ **Tech Stack**
   - **Kotlin**: Modern and concise language.
   - **Jetpack Compose**: Declarative UI Toolkit for Android.
   - **Material 3**: Modern and accessible user interface.
   - **StateFlow**: Reactive state management for real-time updates.
   - **ViewModel**: MVVM architecture to separate business logic from user interface.
   - **Navigation Component**: For seamless screen transitions.

## 📦 **Project Structure**
**Packages**:
1. **Data**:
   - Defines the data needed for orders, such as available flavors and quantity options.
   - Includes OrderUiState to manage order status.
2. **Ui**:
   - Implements the user interface using Jetpack Compose.
   - Contains key screens such as:
      - **StartOrderScreen**: Allows users to select the quantity of cupcakes.
      - **SelectOptionScreen**: Enables flavor and pickup date selection.
      - **OrderSummaryScreen**: Displays the full summary of the order.
   - Manages navigation between screens using the Navigation Component.
   - Includes an AppBar with back navigation functionality for each screen.
3. **Components**:
   - Contains reusable composables like FormattedPriceLabel.
   - Defines enumerations for navigation (CupcakeScreenEnum).
4. **Viewmodel**:
   - Contains OrderViewModel, which:
      - Manages the state of the order.
      - Calculates prices dynamically.
      - Handles order resets and updates.


## 🚀 **How to Use**
1. **Launch the App**: Open the Cupcake App on a device or emulator.
2. **Personalize Your Order**:
   - Choose the number of cupcakes you want.
   - Select a flavor and pickup date.
3. **Navigate Between Screens**:
   - Use the AppBar back button or device back button to return to the previous screen.
4. **Review Your Order**:
   - View the order summary, including the total price.
   - Confirm or cancel as needed.
5. **Enjoy**: Experiment with different configurations to explore the app's features!