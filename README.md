
# TestAppActivityCallbacks

`TestAppActivityCallbacks` is a class that extends `Application.ActivityLifecycleCallbacks` to monitor and respond to Android `Activity` lifecycle events. This class provides overridden methods corresponding to various lifecycle stages (e.g., `onActivityCreated`, `onActivityStarted`, etc.), which are triggered automatically whenever the associated lifecycle events occur in your app's activities.

## Features

- Monitors lifecycle events of all activities in the application.
- Centralized logging or handling of activity lifecycle methods.
- Useful for debugging, analytics, or maintaining app-wide state during activity transitions.

## Usage

To use `TestAppActivityCallbacks`, ensure it is registered in your `Application` class. Here’s an example setup:

### Implementation in `TestApplication`

```kotlin
class TestApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(TestAppActivityCallbacks())
    }
}

class TestAppActivityCallbacks : Application.ActivityLifecycleCallbacks {

    private val TAG = "TestApp"

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        Log.d(TAG, "Activity created: ${activity.localClassName}")
    }

    override fun onActivityStarted(activity: Activity) {
        Log.d(TAG, "Activity started: ${activity.localClassName}")
    }

    override fun onActivityResumed(activity: Activity) {
        Log.d(TAG, "Activity resumed: ${activity.localClassName}")
    }

    override fun onActivityPaused(activity: Activity) {
        Log.d(TAG, "Activity paused: ${activity.localClassName}")
    }

    override fun onActivityStopped(activity: Activity) {
        Log.d(TAG, "Activity stopped: ${activity.localClassName}")
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
        Log.d(TAG, "Activity state saved: ${activity.localClassName}")
    }

    override fun onActivityDestroyed(activity: Activity) {
        Log.d(TAG, "Activity destroyed: ${activity.localClassName}")
    }
}
```

### How It Works

1. Register `TestAppActivityCallbacks` in the `Application` class during app initialization.
2. The overridden methods in `TestAppActivityCallbacks` will be triggered automatically for each corresponding activity lifecycle event.
3. You can customize the behavior in these methods to suit your app's needs, such as logging events, managing analytics, or responding to lifecycle changes.

## Benefits

- **Centralized Management**: Manage all `Activity` lifecycle events from one place.
- **Ease of Debugging**: Get insights into activity lifecycle behavior.
- **Extensibility**: Easily extend the class to add custom logic for lifecycle events.

##
- PS - This was really helpful for me when I was a fresher and going through company features to help me find activities being called
