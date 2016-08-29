import java.util.ArrayList;

class RootModel {

	public String type;
	public String location_name;
	public String email;
	public String end_time;
	public String privacy;
	public int id;
	public String timezone;
	public String organizer_description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String description;
	public String code_of_conduct;
	public String organizer_name;
	public String state;
	public String start_time;
	public String topic;
	public String background_image;
	public VersionModel _version;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public CreatorModel _creator;

	public RootModel(String type, String location_name, String email, String end_time, String privacy, int id, String timezone, String organizer_description, String schedule_published_on, Call_for_papersModel call_for_papers, String logo, String description, String code_of_conduct, String organizer_name, String state, String start_time, String topic, String background_image, VersionModel version, String name, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, CreatorModel creator) {

		this.type = type;
		this.location_name = location_name;
		this.email = email;
		this.end_time = end_time;
		this.privacy = privacy;
		this.id = id;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.state = state;
		this.start_time = start_time;
		this.topic = topic;
		this.background_image = background_image;
		this._version = version;
		this.name = name;
		this.social_links = social_links;
		this._copyright = copyright;
		this._creator = creator;

	}

}