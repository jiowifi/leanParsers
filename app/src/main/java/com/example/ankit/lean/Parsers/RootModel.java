import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String background_image;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_description;
	public VersionModel _version;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String organizer_name;
	public String end_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public int id;
	public CopyrightModel _copyright;
	public String start_time;
	public String timezone;
	public String name;
	public String type;
	public String topic;
	public String location_name;
	public String description;

	public RootModel(String privacy, String background_image, String state, Call_for_papersModel call_for_papers, String email, String organizer_description, VersionModel version, CreatorModel creator, ArrayList<Social_linksModel> social_links, String logo, String organizer_name, String end_time, String schedule_published_on, String code_of_conduct, int id, CopyrightModel copyright, String start_time, String timezone, String name, String type, String topic, String location_name, String description) {

		this.privacy = privacy;
		this.background_image = background_image;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_description = organizer_description;
		this._version = version;
		this._creator = creator;
		this.social_links = social_links;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._copyright = copyright;
		this.start_time = start_time;
		this.timezone = timezone;
		this.name = name;
		this.type = type;
		this.topic = topic;
		this.location_name = location_name;
		this.description = description;

	}

}