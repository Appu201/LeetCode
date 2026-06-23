/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {      // functions = array of functions
    if (functions.length === 0) {        // if array is empty
        return function (x) {             // return identity function
            return x;                    // return input unchanged
        };
    }
    else {
        return function (x) {             // function that takes input x
            var result = functions[functions.length - 1](x); // apply last function first
            for (var i = functions.length - 2; i >= 0; i--) { //move backwards through remaining functions
                result = functions[i](result); //apply current function to result
            }
            return result;// return final answer
        };
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */