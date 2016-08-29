import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String topic;
	public int id;
	public String email;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String description;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;
	public String privacy;
	public String type;
	public String logo;
	public String schedule_published_on;
	public String name;
	public String start_time;
	public String timezone;
	public String organizer_description;

	public RootModel(String end_time, CopyrightModel copyright, String code_of_conduct, String topic, int id, String email, String state, Call_for_papersModel call_for_papers, VersionModel version, ArrayList<Social_linksModel> social_links, String location_name, String description, CreatorModel creator, String organizer_name, String background_image, String privacy, String type, String logo, String schedule_published_on, String name, String start_time, String timezone, String organizer_description) {

		this.end_time = end_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.id = id;
		this.email = email;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.social_links = social_links;
		this.location_name = location_name;
		this.description = description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.type = type;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;

	}

}