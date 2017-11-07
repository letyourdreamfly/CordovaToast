var exec = require('cordova/exec');

exports.showToast = function (success, error) {
    exec(success, error, 'CordovaToast', 'showToast', []);
};
