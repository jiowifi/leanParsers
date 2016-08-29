import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String type;
	public String start_time;
	public String name;
	public String schedule_published_on;
	public String location_name;
	public String email;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String privacy;
	public String timezone;
	public String code_of_conduct;
	public String logo;
	public String organizer_name;
	public CreatorModel _creator;
	public String description;
	public String organizer_description;
	public int id;
	public String state;
	public String end_time;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String topic;

	public RootModel(Call_for_papersModel call_for_papers, String type, String start_time, String name, String schedule_published_on, String location_name, String email, CopyrightModel copyright, VersionModel version, String privacy, String timezone, String code_of_conduct, String logo, String organizer_name, CreatorModel creator, String description, String organizer_description, int id, String state, String end_time, String background_image, ArrayList<Social_linksModel> social_links, String topic) {

		this._call_for_papers = call_for_papers;
		this.type = type;
		this.start_time = start_time;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.email = email;
		this._copyright = copyright;
		this._version = version;
		this.privacy = privacy;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.description = description;
		this.organizer_description = organizer_description;
		this.id = id;
		this.state = state;
		this.end_time = end_time;
		this.background_image = background_image;
		this.social_links = social_links;
		this.topic = topic;

	}

}