import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String organizer_name;
	public String type;
	public VersionModel _version;
	public String background_image;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String state;
	public String timezone;
	public String logo;
	public String start_time;
	public String schedule_published_on;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String organizer_description;
	public String email;
	public String name;
	public String location_name;
	public String description;

	public RootModel(CopyrightModel copyright, String organizer_name, String type, VersionModel version, String background_image, String end_time, ArrayList<Social_linksModel> social_links, String privacy, CreatorModel creator, String code_of_conduct, String state, String timezone, String logo, String start_time, String schedule_published_on, int id, Call_for_papersModel call_for_papers, String topic, String organizer_description, String email, String name, String location_name, String description) {

		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.type = type;
		this._version = version;
		this.background_image = background_image;
		this.end_time = end_time;
		this.social_links = social_links;
		this.privacy = privacy;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.timezone = timezone;
		this.logo = logo;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.email = email;
		this.name = name;
		this.location_name = location_name;
		this.description = description;

	}

}