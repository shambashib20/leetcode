/**
 * @param {string} s
 * @return {number}
 */

const numDecodings = (s) => {
  if (s[0] === '0') return 0
  
  const ways = new Array(s.length+1).fill(0).fill(1, 0, 2) // [1,1,0,0,.....]
  for (let i = 2; i <= s.length; i++) {
    let prevOne = Number(s[i-1]) // first character
    let prevTwo = Number(s[i-2])*10 + Number(s[i-1]) // first two characters
    if (1 <= prevOne && prevOne <= 9) ways[i] += ways[i-1]
    if (10 <= prevTwo && prevTwo <= 26) ways[i] += ways[i-2]
  }
  return ways[s.length]
}