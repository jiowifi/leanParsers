import java.util.ArrayList;

class RootModel {

	public int id;
	public String end_time;
	public String name;
	public String type;
	public String email;
	public String organizer_description;
	public String description;
	public String background_image;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public VersionModel _version;
	public CreatorModel _creator;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;
	public String code_of_conduct;
	public String logo;
	public String start_time;
	public String topic;
	public String location_name;

	public RootModel(int id, String end_time, String name, String type, String email, String organizer_description, String description, String background_image, String organizer_name, ArrayList<Social_linksModel> social_links, String timezone, VersionModel version, CreatorModel creator, String schedule_published_on, Call_for_papersModel call_for_papers, CopyrightModel copyright, String state, String privacy, String code_of_conduct, String logo, String start_time, String topic, String location_name) {

		this.id = id;
		this.end_time = end_time;
		this.name = name;
		this.type = type;
		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.timezone = timezone;
		this._version = version;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.start_time = start_time;
		this.topic = topic;
		this.location_name = location_name;

	}

}