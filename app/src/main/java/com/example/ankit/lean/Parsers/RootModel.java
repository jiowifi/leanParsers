import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String logo;
	public String background_image;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String email;
	public String name;
	public String code_of_conduct;
	public String end_time;
	public String type;
	public String privacy;
	public int id;
	public String organizer_description;
	public String organizer_name;
	public String location_name;
	public String description;
	public String schedule_published_on;
	public String state;
	public CreatorModel _creator;

	public RootModel(String start_time, String logo, String background_image, String timezone, Call_for_papersModel call_for_papers, String topic, ArrayList<Social_linksModel> social_links, VersionModel version, CopyrightModel copyright, String email, String name, String code_of_conduct, String end_time, String type, String privacy, int id, String organizer_description, String organizer_name, String location_name, String description, String schedule_published_on, String state, CreatorModel creator) {

		this.start_time = start_time;
		this.logo = logo;
		this.background_image = background_image;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.social_links = social_links;
		this._version = version;
		this._copyright = copyright;
		this.email = email;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.type = type;
		this.privacy = privacy;
		this.id = id;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._creator = creator;

	}

}