package org.apache.yldemo;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.Toast; 

/**
 * This class echoes a string called from JavaScript.
 */
public class CordovaToast extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
       if("showToast".equals(action)){  
		Toast.makeText(cordova.getActivity(), "你成功了...", Toast.LENGTH_SHORT).show();  
		callbackContext.success("success");  
		return true;  
		}
		callbackContext.error("error"); 
        return false;   
}  
  

}
