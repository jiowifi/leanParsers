import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String code_of_conduct;
	public VersionModel _version;
	public String timezone;
	public String logo;
	public String email;
	public String description;
	public int id;
	public CopyrightModel _copyright;
	public String end_time;
	public String start_time;
	public String name;
	public String topic;
	public String organizer_name;
	public String location_name;
	public String privacy;
	public String schedule_published_on;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public CreatorModel _creator;

	public RootModel(String organizer_description, ArrayList<Social_linksModel> social_links, String state, String code_of_conduct, VersionModel version, String timezone, String logo, String email, String description, int id, CopyrightModel copyright, String end_time, String start_time, String name, String topic, String organizer_name, String location_name, String privacy, String schedule_published_on, String background_image, Call_for_papersModel call_for_papers, String type, CreatorModel creator) {

		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.timezone = timezone;
		this.logo = logo;
		this.email = email;
		this.description = description;
		this.id = id;
		this._copyright = copyright;
		this.end_time = end_time;
		this.start_time = start_time;
		this.name = name;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this._creator = creator;

	}

}