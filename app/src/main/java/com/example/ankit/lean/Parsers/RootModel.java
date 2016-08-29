import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public int id;
	public String location_name;
	public String code_of_conduct;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String end_time;
	public String organizer_name;
	public String timezone;
	public String state;
	public String privacy;
	public String organizer_description;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String description;
	public String topic;
	public String logo;
	public String email;
	public String start_time;

	public RootModel(CreatorModel creator, int id, String location_name, String code_of_conduct, String name, ArrayList<Social_linksModel> social_links, String background_image, String type, Call_for_papersModel call_for_papers, VersionModel version, String end_time, String organizer_name, String timezone, String state, String privacy, String organizer_description, String schedule_published_on, CopyrightModel copyright, String description, String topic, String logo, String email, String start_time) {

		this._creator = creator;
		this.id = id;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.state = state;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this.email = email;
		this.start_time = start_time;

	}

}