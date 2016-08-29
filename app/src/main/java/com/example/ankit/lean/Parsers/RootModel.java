import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String logo;
	public String description;
	public String email;
	public String location_name;
	public String privacy;
	public String organizer_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String type;
	public String timezone;
	public String state;
	public String code_of_conduct;
	public String name;
	public String end_time;
	public int id;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;

	public RootModel(VersionModel version, String logo, String description, String email, String location_name, String privacy, String organizer_name, String schedule_published_on, CopyrightModel copyright, String organizer_description, String start_time, String topic, ArrayList<Social_linksModel> social_links, String background_image, String type, String timezone, String state, String code_of_conduct, String name, String end_time, int id, CreatorModel creator, Call_for_papersModel call_for_papers) {

		this._version = version;
		this.logo = logo;
		this.description = description;
		this.email = email;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.topic = topic;
		this.social_links = social_links;
		this.background_image = background_image;
		this.type = type;
		this.timezone = timezone;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.end_time = end_time;
		this.id = id;
		this._creator = creator;
		this._call_for_papers = call_for_papers;

	}

}