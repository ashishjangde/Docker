# Use the official Node.js image.
FROM node

# Set the working directory in the container.
WORKDIR /myApp

# Copy all files to the working directory.
COPY . .

# Install app dependencies.
RUN npm install

# Expose the port your app runs on.
EXPOSE 3001

# Run the application using npm run dev.
CMD ["npm", "run", "dev"]
