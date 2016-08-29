import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String type;
	public String state;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public int id;
	public String end_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String name;
	public String schedule_published_on;
	public String start_time;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String topic;
	public String organizer_name;
	public String location_name;
	public String background_image;
	public String description;

	public RootModel(String organizer_description, CreatorModel creator, VersionModel version, String type, String state, String timezone, ArrayList<Social_linksModel> social_links, String logo, int id, String end_time, CopyrightModel copyright, String code_of_conduct, String name, String schedule_published_on, String start_time, String privacy, Call_for_papersModel call_for_papers, String email, String topic, String organizer_name, String location_name, String background_image, String description) {

		this.organizer_description = organizer_description;
		this._creator = creator;
		this._version = version;
		this.type = type;
		this.state = state;
		this.timezone = timezone;
		this.social_links = social_links;
		this.logo = logo;
		this.id = id;
		this.end_time = end_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.background_image = background_image;
		this.description = description;

	}

}