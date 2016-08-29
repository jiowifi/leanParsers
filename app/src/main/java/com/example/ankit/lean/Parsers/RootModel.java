import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String organizer_name;
	public String end_time;
	public String location_name;
	public String state;
	public int id;
	public String description;
	public String topic;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public CreatorModel _creator;
	public String background_image;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String privacy;
	public String schedule_published_on;
	public String logo;
	public String type;
	public String email;

	public RootModel(VersionModel version, String organizer_name, String end_time, String location_name, String state, int id, String description, String topic, CopyrightModel copyright, String code_of_conduct, String organizer_description, Call_for_papersModel call_for_papers, String start_time, CreatorModel creator, String background_image, String name, ArrayList<Social_linksModel> social_links, String timezone, String privacy, String schedule_published_on, String logo, String type, String email) {

		this._version = version;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.location_name = location_name;
		this.state = state;
		this.id = id;
		this.description = description;
		this.topic = topic;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this._creator = creator;
		this.background_image = background_image;
		this.name = name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.type = type;
		this.email = email;

	}

}