import java.util.ArrayList;

class RootModel {

	public int id;
	public String state;
	public CopyrightModel _copyright;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String location_name;
	public String privacy;
	public String start_time;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String email;
	public String description;
	public String name;
	public VersionModel _version;
	public String end_time;
	public String topic;
	public String organizer_name;
	public String timezone;
	public String logo;

	public RootModel(int id, String state, CopyrightModel copyright, String background_image, ArrayList<Social_linksModel> social_links, String schedule_published_on, String location_name, String privacy, String start_time, String code_of_conduct, CreatorModel creator, String type, Call_for_papersModel call_for_papers, String organizer_description, String email, String description, String name, VersionModel version, String end_time, String topic, String organizer_name, String timezone, String logo) {

		this.id = id;
		this.state = state;
		this._copyright = copyright;
		this.background_image = background_image;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.privacy = privacy;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this.name = name;
		this._version = version;
		this.end_time = end_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.logo = logo;

	}

}