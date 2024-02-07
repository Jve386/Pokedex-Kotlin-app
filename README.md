# Pokémon App with PokeAPI 🌐

## API
- [PokeAPI](https://pokeapi.co/): Provides information about Pokémon.

## Technologies Used 💻
- Language: Kotlin
- Dependency Injection: Dagger Hilt
- Coroutines: kotlinx.coroutines
- Coroutine Lifecycle Scopes
- Network Requests: Retrofit

## Features ⚙️
- Retrieve detailed information about Pokémon using the PokeAPI.
- Display Pokémon details, abilities, and other relevant information.
- Seamless integration of Dagger Hilt for dependency injection.
- Handle asynchronous tasks with Kotlin Coroutines.
- Lifecycle-aware coroutine scopes for resource management.

## Key Components 🛠️

### 🌟 Models:
- `PokemonModel`
  - Purpose: Represents the structure of Pokémon data.
  - Responsibilities:
    - Holds information about Pokémon, such as name, abilities, and details.

### 🎨 UI:
- `MainActivity`
  - Purpose: Launches the main activity with a button to navigate to the Pokémon list.
  - Responsibilities:
    - Uses View Binding to inflate the layout.
    - Navigates to the `PokemonListActivity` on button click.

- `PokemonListActivity`
  - Purpose: Displays a list of Pokémon retrieved from the PokeAPI.
  - Responsibilities:
    - Utilizes RecyclerView for displaying the list of Pokémon.
    - Handles item click events to navigate to the `PokemonDetailActivity`.

- `PokemonDetailActivity`
  - Purpose: Shows detailed information about a selected Pokémon.
  - Responsibilities:
    - Retrieves and displays information about a specific Pokémon.
    - Utilizes coroutines for handling asynchronous tasks.

### 📡 Network:
- `PokemonApiService`
  - Purpose: Interface for PokeAPI requests using Retrofit.
  - Responsibilities:
    - Defines API endpoints for retrieving Pokémon data.

### 🔄 Coroutines:
- `PokemonCoroutineScope`
  - Purpose: Manages coroutines for background tasks related to Pokémon data.
  - Responsibilities:
    - Launches coroutines for making API requests and handling responses.

### 🪛 Dependency Injection:
- `PokemonApplication`
  - Purpose: Custom application class for initializing Dagger Hilt.
  - Responsibilities:
    - Configures Dagger Hilt for dependency injection.
