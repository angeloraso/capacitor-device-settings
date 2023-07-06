import Foundation

@objc public class DeviceSettings: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
