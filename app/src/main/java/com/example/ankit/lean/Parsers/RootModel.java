import java.util.ArrayList;

class RootModel {

	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String privacy;
	public String code_of_conduct;
	public String location_name;
	public String type;
	public String logo;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String start_time;
	public int id;
	public String end_time;
	public String email;
	public String background_image;
	public String name;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String schedule_published_on;
	public String description;
	public String organizer_name;
	public VersionModel _version;

	public RootModel(String timezone, Call_for_papersModel call_for_papers, String topic, String privacy, String code_of_conduct, String location_name, String type, String logo, CreatorModel creator, ArrayList<Social_linksModel> social_links, String state, String start_time, int id, String end_time, String email, String background_image, String name, CopyrightModel copyright, String organizer_description, String schedule_published_on, String description, String organizer_name, VersionModel version) {

		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.type = type;
		this.logo = logo;
		this._creator = creator;
		this.social_links = social_links;
		this.state = state;
		this.start_time = start_time;
		this.id = id;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this.name = name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_name = organizer_name;
		this._version = version;

	}

}