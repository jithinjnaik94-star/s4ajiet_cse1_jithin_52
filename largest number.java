class Solution {
public:
    string largestNumber(vector<int>& nums) {
        vector<string> asStrings;
        for (int num : nums) {
            asStrings.push_back(to_string(num));
        }
        sort(asStrings.begin(), asStrings.end(), [](const string& a, const string& b) {
            return a + b > b + a;
        });
        if (asStrings[0] == "0") {
            return "0";
        }
        string result = "";
        for (const string& s : asStrings) {
            result += s;
        }
        return result;
    }
};   
    
