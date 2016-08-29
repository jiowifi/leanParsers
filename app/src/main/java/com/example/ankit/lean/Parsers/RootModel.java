import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String privacy;
	public String state;
	public String type;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String topic;
	public String schedule_published_on;
	public String location_name;
	public String organizer_name;
	public String start_time;
	public String description;
	public String organizer_description;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String name;
	public int id;
	public String background_image;
	public VersionModel _version;
	public String logo;
	public String email;

	public RootModel(String end_time, String privacy, String state, String type, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String code_of_conduct, String topic, String schedule_published_on, String location_name, String organizer_name, String start_time, String description, String organizer_description, CreatorModel creator, Call_for_papersModel call_for_papers, String timezone, String name, int id, String background_image, VersionModel version, String logo, String email) {

		this.end_time = end_time;
		this.privacy = privacy;
		this.state = state;
		this.type = type;
		this._copyright = copyright;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.description = description;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.name = name;
		this.id = id;
		this.background_image = background_image;
		this._version = version;
		this.logo = logo;
		this.email = email;

	}

}